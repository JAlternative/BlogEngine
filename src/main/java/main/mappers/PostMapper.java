package main.mappers;

import main.dto.PostsDTO;
import main.dto.api.response.PostsIdResponse;
import main.mappers.converter.DateConverter;
import main.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {DateConverter.class, UserMapper.class, PostCommentsMapper.class})
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "id", source = "post.id")
    @Mapping(target = "timeStamp", source = "post.time", qualifiedByName = "convertRegDate")
    @Mapping(target = "userDTO", source = "post.user", qualifiedByName = "toUserDTO")
    @Mapping(target = "title", source = "post.title")
    @Mapping(target = "announce", source = "post.text")
    @Mapping(target = "likeCount", expression = "java(post.getLikesAmount())")
    @Mapping(target = "dislikeCount", expression = "java(post.getDislikesAmount())")
    @Mapping(target = "commentCount", expression = "java(post.getCommentCount())")
    @Mapping(target = "viewCount", source = "post.viewCount")
    PostsDTO toPostDTO(Post post);

    @Mapping(target = "id", source = "post.id")
    @Mapping(target = "timeStamp", source = "post.time", qualifiedByName = "convertRegDate")
    @Mapping(target = "active", expression = "java(post.getIsActiveResult())")
    @Mapping(target = "userDTO", source = "post.user", qualifiedByName = "toUserDTO")
    @Mapping(target = "title", source = "post.title")
    @Mapping(target = "text", source = "post.text")
    @Mapping(target = "likeCount", expression = "java(post.getLikesAmount())")
    @Mapping(target = "dislikeCount", expression = "java(post.getDislikesAmount())")
    @Mapping(target = "comments", source = "post.postCommentsList", qualifiedByName = "toListCommentDTO")
    @Mapping(target = "tags", expression = "java(post.getTagNameList())")
    PostsIdResponse toPostResponseById(Post post);

}