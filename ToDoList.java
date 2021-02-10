public class ToDoList {
	
	private String toDoListName;
	private String[] myToDoList;

	public ToDoList(String toDoListName) {
		this.toDoListName = toDoListName;
		this.myToDoList = new String[7]; 
		for (int i = 0; i < myToDoList.length; i++) {
			myToDoList[i] = "";
		}
	}
	
	public String getToDoListName() {
		return toDoListName;
	}

	public String[] getMyToDoList() {
		return myToDoList;
	}
}
