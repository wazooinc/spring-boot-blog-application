package com.example.springbootblogapplication.config;

import com.example.springbootblogapplication.models.Account;
import com.example.springbootblogapplication.models.Post;
import com.example.springbootblogapplication.services.AccountService;
import com.example.springbootblogapplication.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.size() == 0) {

            Account account1 = new Account();
            Account account2 = new Account();

            account1.setFirstName("homer");
            account1.setLastName("simpson");
            account1.setEmail("h.simpson@springfield.com");

            account2.setFirstName("chief");
            account2.setLastName("wiggum");
            account2.setEmail("c.wiggum@springfield.com");

            accountService.save(account1);
            accountService.save(account2);

            Post post1 = new Post();
            post1.setTitle("What is Lorem Ipsum?");
            post1.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            post1.setAccount(account1);

            Post post2 = new Post();
            post2.setTitle("Something else Ipsum");
            post2.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Magna eget est lorem ipsum dolor sit amet consectetur adipiscing. Tempus quam pellentesque nec nam aliquam sem et tortor. Pellentesque sit amet porttitor eget. Sed augue lacus viverra vitae congue eu consequat. Ultrices vitae auctor eu augue. Mattis rhoncus urna neque viverra. Consectetur lorem donec massa sapien faucibus et molestie ac feugiat. Sociis natoque penatibus et magnis dis parturient montes nascetur. Cursus turpis massa tincidunt dui ut ornare lectus. Odio pellentesque diam volutpat commodo sed egestas egestas fringilla. Id cursus metus aliquam eleifend mi. Nibh nisl condimentum id venenatis a condimentum.");
            post2.setAccount(account2);

            postService.save(post1);
            postService.save(post2);
        }
    }

}
