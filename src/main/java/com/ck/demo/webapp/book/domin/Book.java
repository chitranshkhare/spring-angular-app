package com.ck.demo.webapp.book.domin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ck.demo.webapp.user.domin.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "books")
public class Book implements Serializable {

	private static final long serialVersionUID = 2621710426311278996L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name = "name", nullable = false, length = 150)
	private String name;

	@Column(name = "auther", nullable = false, length = 50)
	private String auther;

	@Column(name = "is_available", nullable = false)
	private Boolean isAvailable;

	@Column(name = "photo", nullable = false, length = 255)
	private String photo;
	
	@ManyToMany(mappedBy="books", cascade=CascadeType.ALL)
	Set<User> users = new HashSet<>();

}
