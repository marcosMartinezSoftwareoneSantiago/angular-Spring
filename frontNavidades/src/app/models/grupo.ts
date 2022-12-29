import { Album } from "./album";

export class Grupo{
    nombre:string;
    id:number;
    albumes:Album[];

    constructor(nombre:string, id:number, albumes:Album[]){
        this.nombre = nombre;
        this.id=id;
        this.albumes=albumes;
    }
}