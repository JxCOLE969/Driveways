// import { AppPage } from './app.po';
// import { browser, logging } from 'protractor';
// import { TestComponent } from 'protractor';

// describe('TestComponent', () => {
//   let component: TestComponent;
//   let fixture: ComponentFixture<TestComponent>;
//   let el: DebugElement;

//   beforeEach(() => {
//       fixture = TestBed.createComponent(TestComponent);
//       component = fixture.componentInstance;
//       el = fixture.debugElement;
//       fixture.detectChanges();
//   });

//   it('should display "a new nation" as bold text', () => {
//       const boldText = el.query(By.css('p')).nativeElement;
//       expect(boldText.innerHTML).toContain('<b>a new nation</b>');
//   });
// });

// describe('workspace-project App', () => {
//   let page: AppPage;

//   beforeEach(() => {
//     page = new AppPage();
//   });

//   it('should display welcome message', () => {
//     page.navigateTo();
//     expect(page.getTitleText()).toEqual('Welcome to driveways!');
//   });

//   afterEach(async () => {
//     // Assert that there are no errors emitted from the browser
//     const logs = await browser.manage().logs().get(logging.Type.BROWSER);
//     expect(logs).not.toContain(jasmine.objectContaining({
//       level: logging.Level.SEVERE,
//     }));
//   });
// });
