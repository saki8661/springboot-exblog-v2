package shop.mtcoding.exblogv2.reply;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.exblogv2.board.Board;
import shop.mtcoding.exblogv2.user.User;

@Getter
@Setter
@Table(name = "reply_tb")
@Entity
public class Reply {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = false, length = 100)
    private String comment; // 댓글 내용

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user; // FK user_id

    @ManyToOne
    private Board board; // FK board_id

}
