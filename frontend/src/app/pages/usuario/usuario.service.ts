import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from './model/usuario.model';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  
  constructor(private http : HttpClient) { }

  list() : Observable<Usuario[]> {
    let options = {
      headers: new HttpHeaders().set('Authorization', "Bearer "+localStorage.getItem('token'))
    };
    
    return this.http.get<Usuario[]>("http://localhost:8080/scp/private/usuario",options);
  }

  buscarPorID(guidUsuario: string) : Observable<Usuario>  {
    return this.http.get<Usuario>("http://localhost:8080/usuario/buscarPorID/"+guidUsuario);
  }

  salvar(usuario: Usuario) : Observable<any> {
    return this.http.post<any>
      ("http://localhost:8080/usuario/salvar/",usuario);
  }

  login(login: string, senha: string) : Observable<any> {
    let options = {
      headers: new HttpHeaders().set('Content-Type', 'application/x-www-form-urlencoded')
    };

    return this.http.post<any>
      ("http://localhost:8080/scp/public/login",
        "login="+login+"&senha="+senha, 
        options);
  }

}