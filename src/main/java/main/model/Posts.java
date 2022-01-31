package main.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import main.model.enums.ModerationStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(name = "is_active",nullable = false, columnDefinition = "TINYINT")
    private int isActive;

    @Column(name = "moderation_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private ModerationStatus moderationStatus = ModerationStatus.NEW;

    @Column(name = "moderator_id", columnDefinition = "INT")
    private Integer moderatorId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private Date time;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;

    @Column(name = "view_count", nullable = false, columnDefinition = "INT")
    private int viewCount;

    @OneToMany(mappedBy = "postsId", cascade = CascadeType.ALL)
    private List<PostVotes> postVotesList;

    @OneToMany(mappedBy = "postId", cascade = CascadeType.ALL)
    private List<PostComments> postCommentsList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tags2post",
            joinColumns = {@JoinColumn(name = "post_id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id")}
    )
    private List<Tags> tagsList;


}
