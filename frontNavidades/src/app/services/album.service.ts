import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Album } from '../models/album';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  private httpHeaders:HttpHeaders = new HttpHeaders({'Content-Type' : 'application/json'})

  URL:string= 'http://localhost:8080/api/album/';

  constructor(private http:HttpClient) { }

  getArrayAlbumes(nombreDelGrupo:string):Observable<Album[]>{
    return this.http.get<Album[]>(this.URL+'lista-albumes-del-grupo/'+nombreDelGrupo);
  }

  postAlbum(nombreDelGrupo:string, nombreAlbum:string):Observable<Album>{
    return this.http.post<Album>(this.URL+ 'anadir/'+ nombreDelGrupo + '/' + nombreAlbum, this.httpHeaders);
  }
}
