import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarGruposComponent } from './guardar-grupos.component';

describe('GuardarGruposComponent', () => {
  let component: GuardarGruposComponent;
  let fixture: ComponentFixture<GuardarGruposComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuardarGruposComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarGruposComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
