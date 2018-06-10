import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";
import { RouterModule, Routes } from "@angular/router";
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


import { AppComponent } from './app.component';
import { UserListComponent } from './users/user-list/user-list.component';
import { UserInfoComponent } from './users/user-info/user-info.component';
import { UserService } from './users/user.service';
import { HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [
  { path: 'user-list', component: UserListComponent },
  { path: 'user-info/:id', component: UserInfoComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserInfoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    NgbModule.forRoot()
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
