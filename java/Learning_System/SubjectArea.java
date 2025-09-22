package LearningSystem;

public class SubjectArea {
	
		private int id;
		private String name;
		public SubjectArea(int id, String name) {
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
		
		public String toString() {
			 return "SubjectArea{id=" + id + " name=" + name + "'}";
			 
			
	}

}
