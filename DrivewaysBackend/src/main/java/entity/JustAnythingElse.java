package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JustAnythingElse {

	@Id
	@GeneratedValue
	int name;
}
