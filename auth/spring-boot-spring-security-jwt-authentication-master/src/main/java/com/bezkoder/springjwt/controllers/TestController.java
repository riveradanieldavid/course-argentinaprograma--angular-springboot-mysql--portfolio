package com.bezkoder.springjwt.controllers;

// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content."; // everyone could accessed in ""Public Content"
  }

  // @PreAuthorize:
  // It`s say, only may accessing with a moderator or admin pre-authorization.
  // Original:
  // @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  // User must not accessing to User Content without a admin or moderator
  @GetMapping("/user")
  public String userAccess() {
    return "User Content."; // only User may accessessing to "User Content"
  }

  // Original:
  // @PreAuthorize("hasRole('MODERATOR')")
  // Only mod may accessing to Moderator Board
  @GetMapping("/mod")
  public String moderatorAccess() {
    return "Moderator Board."; // only "mod" and "admin" should would accessing to "Moderator Board".
  }

  // Original:
  // @PreAuthorize("hasRole('ADMIN')")
  // Only admin must accessing here
  @GetMapping("/admin")
  public String adminAccess() {
    return "Admin Board."; // only "admin" should would accessing to "Admin Board".
  }
}
