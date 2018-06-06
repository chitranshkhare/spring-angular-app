import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
	constructor(private http: HttpClient) {
		
	}
	title = 'app';

	ngOnInit(): void {
		this.http.get("http://localhost:8080/go").subscribe(data => {
			console.log(data);
		})
	}
}


//https://api.github.com/users/seeschweiler