package com.ck.demo.webapp.user.domin;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.ck.demo.webapp.book.domin.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1858364333768053122L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable=false, nullable=false)
	private Long id;

	@Column(name="name", nullable=false, length=150)
	private String name;

	@Column(name="username", nullable=false, length=50)
	private String username;

	@Column(name="email", nullable=false, length=150)
	private String email;

	@Column(name="mobileNo", nullable=false, length=15)
	private String mobileNo;
	
	@Column(name="address", nullable=false, length=500)
	private String address;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_books",
	joinColumns= {@JoinColumn(name="user_id", nullable=false, updatable=false)},
	inverseJoinColumns= {@JoinColumn(name="book_id", nullable=false, updatable=false)})
	Set<Book> books = new HashSet<>();

}
