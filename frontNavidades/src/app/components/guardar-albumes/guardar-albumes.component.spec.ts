import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarAlbumesComponent } from './guardar-albumes.component';

describe('GuardarAlbumesComponent', () => {
  let component: GuardarAlbumesComponent;
  let fixture: ComponentFixture<GuardarAlbumesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuardarAlbumesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarAlbumesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
