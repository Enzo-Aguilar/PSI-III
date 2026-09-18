//void main(){
//    Person a = new Person();
//    IO.println(a.CalculateYearOfBirth(2009));
//    IO.println(a.toString());
//    Person b = new Person();
//    b.setAge(27);
//    a.CompareTowPersons(a, b);
//}
void main(){
    Book a =  new Book();
    Book b =  new Book();
    Book c =  new Book();

    a.setBookName("Fairy Tale");
    b.setBookName("One Piece");
    c.setBookName("Detetive Esqueleto");

    a.setAuthor("John Cook");
    b.setAuthor("John Doe");
    c.setAuthor("John, The Author");

    a.setNumberOfPages(5);
    b.setNumberOfPages(10);
    c.setNumberOfPages(256);

    IO.println(a.ResumeBook());
    IO.println(b.ResumeBook());
    IO.println(c.ResumeBook());
}