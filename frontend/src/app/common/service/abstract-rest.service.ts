import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { User } from "../../users/user";

export abstract class AbstractRestService<T> {

    users: User[];
    
    constructor(protected http: HttpClient, protected actionUrl:string) {     
    }

    getAll(requestParam?: string):Observable<T[]> {
        var url = this.actionUrl + (requestParam ? requestParam : '');
        
        return this.http.get<T[]>(url);
    }

    getOne(pathVariable?: string):Observable<T> {
        return this.http.get<T>(this.actionUrl + pathVariable);
    }
}