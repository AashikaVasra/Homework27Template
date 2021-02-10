public class ToDoList {
	
	private String toDoListName;
	private String[] myToDoList;

	public ToDoList(String toDoListName) {
		this.toDoListName = toDoListName;
		// or new String[7] and assign it all to empty strings
		this.myToDoList = {"", "", "", "", "", "", ""};
	}
	
	public String getToDoListName() {
		return toDoListName;
	}

	public String[] getMyToDoList() {
		return myToDoList;
	}
}
