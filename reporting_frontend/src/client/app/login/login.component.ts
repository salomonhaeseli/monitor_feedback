import {Component} from '@angular/core';
import {Router} from '@angular/router';
import {UserService} from '../shared/services/user.service';


@Component({
  moduleId: module.id,
  selector: 'sd-login',
  templateUrl: 'login.component.html',
  styleUrls: ['login.component.css'],
})
export class LoginComponent {
  constructor(private userService:UserService, private router:Router) {
  }

  formSubmitted(event, username, password) {
    event.preventDefault();
    this.userService.loginOnRepository(username, password).subscribe((result) => {
      if (result) {
        this.router.navigate(['']);
      }
    });
  }
}