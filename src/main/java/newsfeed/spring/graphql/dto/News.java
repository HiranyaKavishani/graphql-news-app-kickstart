package newsfeed.spring.graphql.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Entity for storing the News related to a feed
 * 
 * @author Hiranya Abeyrathne <hiranyakavi@gmail.com>
 *
 */
@Entity
public class News {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;
	private Date publicationData;
	private String link;

	public News(String title, String description,  String link) {
		this.title = title;
		this.description = description;
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublicationData() {
		return publicationData;
	}

	public void setPublicationData(Date publicationData) {
		this.publicationData = publicationData;
	}
}
