package main.controller;

import main.dto.UserLoginDTO;
import main.dto.api.request.LoginRequest;
import main.dto.api.request.RegisterRequest;
import main.dto.api.response.CaptchaResponse;
import main.dto.api.response.CheckResponse;
import main.dto.api.response.LoginResponse;
import main.dto.api.response.RegisterResponse;
import main.model.repositories.UserRepository;
import main.service.CaptchaService;
import main.service.CheckService;
import main.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.Principal;

@RestController
@RequestMapping("/api/auth")
public class ApiAuthController {

    private final CheckService checkService;
    private final CaptchaService captchaService;
    private final RegisterService registerService;
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;

    @Autowired
    public ApiAuthController(CheckService checkService, CaptchaService captchaService, RegisterService registerService, AuthenticationManager authenticationManager, UserRepository userRepository) {
        this.checkService = checkService;
        this.captchaService = captchaService;
        this.registerService = registerService;
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
    }

//    @GetMapping("/check")
//    public CheckResponse check() {
//        return checkService.getResult();
//    }

    @GetMapping("/check")
    public ResponseEntity<LoginResponse> check(Principal principal) {
        if (principal == null) {
            return ResponseEntity.ok(new LoginResponse());
        }

        return ResponseEntity.ok(checkService.getLoginResponse(principal.getName()));
    }

    @GetMapping("/captcha")
    private CaptchaResponse captcha() throws IOException {
        return captchaService.getCaptcha();
    }

    @PostMapping("/register")
    private RegisterResponse register(@RequestBody RegisterRequest registerRequest) {
        return registerService.registration(registerRequest);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        Authentication auth = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(auth);
        User user = (User) auth.getPrincipal();

        return ResponseEntity.ok(checkService.getLoginResponse(user.getUsername()));
    }


}
