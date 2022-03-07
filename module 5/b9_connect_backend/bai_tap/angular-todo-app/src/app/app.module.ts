import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { EditTodoComponent } from './todo/edit-todo/edit-todo.component';
import { DeleteTodoComponent } from './todo/delete-todo/delete-todo.component';
import { CreateTodoComponent } from './todo/create-todo/create-todo.component';

@NgModule({
  declarations: [
    AppComponent,
    EditTodoComponent,
    DeleteTodoComponent,
    CreateTodoComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
