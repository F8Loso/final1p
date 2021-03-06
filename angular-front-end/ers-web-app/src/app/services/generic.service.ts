import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GenericService {

  public _localClientDomain: string = 'http://localhost:4200/ers/api';
  public _localServerDomain: string = 'http://localhost:8080/ers/api';

  constructor() { }
}
