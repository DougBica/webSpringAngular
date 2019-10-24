import { Component, OnInit } from "@angular/core";

declare interface RouteInfo {
  path: string;
  title: string;
  rtlTitle: string;
  icon: string;
  class: string;
}
export const ROUTES: RouteInfo[] = [
  {
    path: "/admin/usuario",
    title: "Usuário",
    rtlTitle: "",
    icon: "icon-chart-pie-36",
    class: ""
  },
  {
    path: "/admin/aeronave",
    title: "Aircraft",
    rtlTitle: "",
    icon: "icon-chart-pie-36",
    class: "",

   
    
  },
  {
  path: "/admin/fabricante",
  title: "Manufacturer",
  rtlTitle: "",
  icon: "icon-chart-pie-36",
  class: ""
  }
];

@Component({
  selector: "app-sidebar",
  templateUrl: "./sidebar.component.html",
  styleUrls: ["./sidebar.component.css"]
})
export class SidebarComponent implements OnInit {
  menuItems: any[];

  constructor() {}

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }
  isMobileMenu() {
    if (window.innerWidth > 991) {
      return false;
    }
    return true;
  }
}
