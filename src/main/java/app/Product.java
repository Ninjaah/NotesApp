package app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {


	private Long id;
	private String title;
	private String content;
	private String shared;

	protected Product() {
	}

	protected Product(Long id, String title, String content, String shared) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.shared = shared;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShared() {
		return shared;
	}

	public void setShared(String shared) {
		this.shared = shared;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
