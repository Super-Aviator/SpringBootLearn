package com.springboot.learn.web.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Aviator
 */
@Entity
@Data
@Table(name = "TEACHER_USER_RELATION")
public class TeacherUserRelation {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

//    @Column(name = "USER_ID")
    private Long userId;

//    @Column(name = "FRIEND_ID")
    private Long friendId;
}
