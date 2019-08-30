package encryption.data;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseEntity {

	private String username;
	@Reference
	private List<Message> messageList;

	public User() {
	}

	public User(String username, List<Message> messageList) {
		this.username = username;
		this.messageList = messageList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Message> getMessageList() {
		if (messageList == null) {
			messageList = new ArrayList<>();
		}
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
}
