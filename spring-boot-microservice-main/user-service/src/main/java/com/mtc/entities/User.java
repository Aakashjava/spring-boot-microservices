package com.mtc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String gender;
    private int age;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Transient
    List<Post> posts = new ArrayList<>();
    
}
