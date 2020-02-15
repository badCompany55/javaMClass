package localclass;

public class Button {
  private String title;
  private Onclicklistener onclicklistener;

  public Button(String title) {
    this.title = title;
  }

  public void setonclicklistener(Onclicklistener onclicklistener) {
    this.onclicklistener = onclicklistener;
  }

  public void onClick() {
    this.onclicklistener.onClick(this.title);
  }

  public interface Onclicklistener {
    public void onClick(String title);
  }
}

// todo testing
