import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuscarGrupoComponent } from './components/buscar-grupo/buscar-grupo.component';
import { GuardarAlbumesComponent } from './components/guardar-albumes/guardar-albumes.component';
import { GuardarGruposComponent } from './components/guardar-grupos/guardar-grupos.component'
import { HttpClientModule } from '@angular/common/http';
import { NavegadorComponent } from './components/navegador/navegador.component';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';

const routes:Routes = [
  {path:"", component:HomeComponent},
  {path:"grupo", component:GuardarGruposComponent},
  {path:"disco", component:GuardarAlbumesComponent},
  {path:"verDiscos", component:BuscarGrupoComponent},
  
];

@NgModule({
  declarations: [
    AppComponent,
    GuardarGruposComponent,
    GuardarAlbumesComponent,
    BuscarGrupoComponent,
    NavegadorComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
