public class DList{

  protected DListNode head;
  protected DListNode tail;
  protected long size;

  public DList() {
    head = null;
    tail = null;
    size = 0;
  }

  public void insertFront (int red, int green, int blue, int runlength){
  	if (size == 0) {
		DListNode node = new DListNode (red, green, blue, runlength);
		head  = node;
		tail = head;
		size++;  		
  	}
  	else {
  		DListNode node = new DListNode (red, green, blue, runlength);
  		node.next = head;
  		head.prev = node;
  		head = node;
  		size ++;
  	}
  }

  public void insertBack (int red, int green, int blue, int runlength){
  	if (size == 0) {
		DListNode node = new DListNode (red, green, blue, runlength);
		head  = node;
		tail = head;
		size++;  		
  	}
  	else{
  		DListNode node = new DListNode (red, green, blue, runlength);
  		tail.next = node;
  		node.prev = tail;
  		tail = node;
  		size++;
  	}
  }

}