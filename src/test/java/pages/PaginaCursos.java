package pages;

public class PaginaCursos extends BasePage {

    private String introduccionTestingLink = "//a[normalize-space()='Introducción al Testing de Software']";

    public PaginaCursos() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }

}
