import { Component, OnInit } from '@angular/core';
import { AlbumService } from 'src/app/services/album.service';

@Component({
  selector: 'app-guardar-albumes',
  templateUrl: './guardar-albumes.component.html',
  styleUrls: ['./guardar-albumes.component.css']
})
export class GuardarAlbumesComponent implements OnInit {

  nombreGrupo:string = '';
  nombreAlbum:string = '';

  constructor(private albumService:AlbumService) { }

  ngOnInit(): void {
  }

  enviarAlbum():void{
    this.albumService.postAlbum(this.nombreGrupo, this.nombreAlbum).subscribe(
      res=> console.log(res),
      err => console.error(err),
    );
  }
}
