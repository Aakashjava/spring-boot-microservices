package com.mtc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String userId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    
}
