// import java.util.*;
// //public class demo{
//     public class demo{
//         public static void main(String args[])
//         {
//             Scanner s = new Scanner(System.in);

//             System.out.println("name of emp");
//              String name = s.nextLine();
//              String city = s.nextLine();
//              String country = s.nextLine();
//              int pincode = s.nextInt();

//              Customer c = new Customer(name,city,country,pincode);
//              System.out.println("output:");
//              System.out.println(c.getName());
//                 System.out.println(c.getCity());
//                 System.out.println(c.getCountry());
//                 System.out.println(c.getPincode());
//         }
//     }
//     class Customer 
//     {
//          private String name;
//         private String city;
//          private String country;
//         private int pincode;
// public Customer(String a , String b , String c ,int d){
//     name = a;
//     city = b;
//     country = c;
//     pincode = d;
// }
//  public String getName()
//  {
//     return name;
//  }
//  public String getCity()
//  {
//     return city;
//  }
//  public String getCountry()
//  {
//     return country;
//  }
//  public int getPincode()
//  {
//     return pincode;
//  }

//     }
// package com.ltim.blog_post;  
// import org.springframework.boot.SpringApplication; 
// import org.springframework.boot.autoconfigure.SpringBootApplication;  @SpringBootApplication public class BlogPostApplication {     
//      public static void main(String[] args) {         
//         SpringApplication.run(BlogPostApplication.class, args);     
// }  
// } 
// package com.ltim.blog_post.entity;

// public class Blog {

//     private String title;
//     private String content;
//     private String author;

//     public Blog() {
//     }

//     public Blog(String title, String content, String author) {

//         this.title = title;
//         this.content = content;
//         this.author = author;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getContent() {
//         return content;
//     }

//     public void setContent(String content) {
//         this.content = content;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }
// }

package com.ltim.blog_post.service;

import java.util.List;
import com.ltim.blog_post.entity.Blog;

public interface BlogService {
    public Blog addBlog(Blog blog);

    public Blog getBlog(String title);

    public List<Blog> getAllBlog();
}
package com.ltim.blog_post.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ltim.blog_post.entity.Blog;

@Service
public class BlogServiceImpl implements BlogService {
    List<Blog> list = new ArrayList<>();

@Override     
public Blog addBlog(Blog blog) { 
                                          
list.add(blog); return blog; }
 @Override 
                                          
 public Blog getBlog(String title)
                                     
 for(Blog b : list) 
                                          
 { if(b.getTitle().equals(title)) { return b; } 
                                        
} return null; 
}

return list;
}}