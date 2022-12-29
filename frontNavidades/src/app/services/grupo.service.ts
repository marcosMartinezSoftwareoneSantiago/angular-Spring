import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Grupo} from '../models/grupo';


@Injectable({
  providedIn: 'root'
})
export class GrupoService {

  private httpHeaders:HttpHeaders = new HttpHeaders({'Content-Type' : 'application/json'})
  
  URL_ANADIR_GRUPO:string = "http://localhost:8080/api/grupo/anadir/";

  constructor(private http:HttpClient) { }

  postGrupo(nombreDelGrupo:string):Observable<Grupo>{
    return this.http.post<Grupo>(this.URL_ANADIR_GRUPO+nombreDelGrupo, {headers: this.httpHeaders});
  }

}
