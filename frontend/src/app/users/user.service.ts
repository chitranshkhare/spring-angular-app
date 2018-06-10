import { Injectable } from '@angular/core';
import { AbstractRestService } from '../common/service/abstract-rest.service';
import { User } from './user';
import { HttpClient } from '@angular/common/http';

const actionUrl: string = "http://localhost:8080/users"

@Injectable({
  providedIn: 'root'
})
export class UserService extends AbstractRestService<User>{

  constructor(http: HttpClient) { 
    super(http, actionUrl);
  }

}
