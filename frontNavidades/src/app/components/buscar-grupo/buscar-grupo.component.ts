import { Component, OnInit } from '@angular/core';
import { AlbumService } from 'src/app/services/album.service';
import { Album } from 'src/app/models/album';

@Component({
  selector: 'app-buscar-grupo',
  templateUrl: './buscar-grupo.component.html',
  styleUrls: ['./buscar-grupo.component.css']
})
export class BuscarGrupoComponent implements OnInit {

  albumes:Album[] = [new Album(0, "none")];
  nombreDelGrupo:string="";
  mostrarDiscos:boolean=false;
  grupoBuscado:string = "";

  constructor(private albumService:AlbumService) { }

  ngOnInit(): void {
  }

  buscarGrupo():void{
    this.albumService.getArrayAlbumes(this.nombreDelGrupo).subscribe(
      res => {
        this.albumes = res;
        this.mostrarDiscos = true;
        this.grupoBuscado = this.nombreDelGrupo;
      },
      err => {
        console.error(err)
        this.mostrarDiscos=false;
      },
    )
  }
}
