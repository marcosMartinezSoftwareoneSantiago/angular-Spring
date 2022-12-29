import { Component, OnInit } from '@angular/core';
import { GrupoService } from 'src/app/services/grupo.service';

@Component({
  selector: 'app-guardar-grupos',
  templateUrl: './guardar-grupos.component.html',
  styleUrls: ['./guardar-grupos.component.css']
})
export class GuardarGruposComponent implements OnInit {
  nombreGrupo:string = "";

  constructor(private grupoService:GrupoService) { }

  ngOnInit(): void {
  }

  enviarGrupo():void{
    this.grupoService.postGrupo(this.nombreGrupo).subscribe(
      res => console.log(res),
      err => console.error(err),
    );
  }

}
