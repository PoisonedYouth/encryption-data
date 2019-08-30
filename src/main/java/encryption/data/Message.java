package encryption.data;

import org.mongodb.morphia.annotations.Entity;

@Entity
public class Message extends BaseEntity {
	private String text;
	private String encryptedText;

	public Message() {
	}

	public Message(String text, String encryptedText) {
		this.text = text;
		this.encryptedText = encryptedText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEncryptedText() {
		return encryptedText;
	}

	public void setEncryptedText(String encryptedText) {
		this.encryptedText = encryptedText;
	}
}
