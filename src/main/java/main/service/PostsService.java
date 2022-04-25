package main.service;

import main.dto.PostsDTO;
import main.dto.UserDTO;
import main.dto.api.response.PostsResponse;
import main.model.Post;
import main.model.User;
import main.model.repositories.PostRepository;
import main.model.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostsService {

    private final PostRepository postsRepository;
    private final UserRepository userRepository;

//    private Sort sort;
//    private int countPosts;

    public PostsService(PostRepository postsRepository, UserRepository userRepository) {
        this.postsRepository = postsRepository;
        this.userRepository = userRepository;
    }


    public PostsResponse getPosts(int offset, int limit, String mode) {
        List<PostsDTO> postsDTOList = new ArrayList<>();
        PostsResponse postsResponse = new PostsResponse();

        //Optional<Posts> postsOptional = postsRepository.findAllByUserId(1);

        List<Post> postsList = new ArrayList<>();
        //List<Post> postsList = postsRepository.findAll();

        //List<Post> postsList = ;

//        recent - сортировать по дате публикации, выводить сначала новые (если mode не задан,
//                использовать это значение по умолчанию)
        System.out.println("А тут бываем?");

        if (mode.equals("recent")) {
            System.out.println("Мы хоть зайдём сюда?");
            postsList.addAll(
                    postsRepository.findAll().stream()
                            .sorted(Collections.reverseOrder())
                            .collect(Collectors.toList())
            );


//            postsRepository.findAll().stream()
//                    .sorted(Collections.reverseOrder())
//                    .collect(Collectors.toList());
        }

        Page<Post> postsPage = postsRepository.findAll(PageRequest.of(1, 5));

        System.out.println("Размер пагинации" + postsPage.getSize());


//        postsList.stream().forEach(el -> {
//            System.out.println(el.getId() + "айди и " + el.getText());
//        });

        for (int a = 0; a < postsList.size(); a++) {
            PostsDTO postsDTO = new PostsDTO();
            postsDTO.setId(postsList.get(a).getId());
            postsDTO.setTimeStamp(1592338706); //потом взять из базы, переконвертировать время в секунды

            UserDTO userDTO = new UserDTO();
            Optional<User> optionalUser = userRepository.findUserById(postsList.get(a).getUserId().getId());

            userDTO.setName(optionalUser.get().getName());
            userDTO.setId(optionalUser.get().getId());
            postsDTO.setUserDTO(userDTO);

            postsDTO.setTitle(postsList.get(a).getTitle());
            postsDTO.setAnnounce(postsList.get(a).getText());
            postsDTO.setLikeCount(455);
            postsDTO.setDislikeCount(233);
            postsDTO.setCommentCount(555);
            postsDTO.setViewCount(111);

            postsDTOList.add(postsDTO);

        }

        postsResponse.setCount(390);
        postsResponse.setPostsDTO(postsDTOList);
        return postsResponse;
    }
}



/* PostsDTO postsDTO = new PostsDTO();
        postsDTO.setId(345);
        postsDTO.setTimeStamp(1592338706);

        UserDTO userDTO = new UserDTO();
        userDTO.setName("Дмитрий Петров");
        userDTO.setId(123);

        postsDTO.setUserDTO(userDTO);
        postsDTO.setTitle("Title");
        postsDTO.setAnnounce("Announce");
        postsDTO.setLikeCount(455);
        postsDTO.setDislikeCount(233);
        postsDTO.setCommentCount(555);
        postsDTO.setViewCount(111);

        postsDTOList.add(postsDTO);

        postsResponse.setCount(390);
        postsResponse.setPostsDTO(postsDTOList);*/