import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Reserva } from '../model/reserva.model';

@Injectable({
  providedIn: 'root'
})
export class ReservaService {

  private readonly API = 'http://200.98.142.28:8080/scp/public/reserva/'

  constructor(private http : HttpClient) { }

  listById(id: String) : Observable<Reserva>{
    return this.http.get<Reserva>(this.API+id);
  }

  listAll(){
    return this.http.get<Reserva[]>(this.API);
  }

  salvar(reserva: Reserva) : Observable<Reserva> {
    return this.http.post<Reserva>(this.API, reserva);
  }

}
