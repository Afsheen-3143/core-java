package LearningSystem;

public class Chapters {
	private int id;
	 private String name;
	 public Chapters(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }
	 public int getId() {
		return id;
	 }
	 public void setId(int id) {
		this.id = id;
	 }
	 public String getName() {
		return name;
	 }
	 public void setName(String name) {
		this.name = name;
	 }
	 @Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	}


