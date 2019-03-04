// the syntax for Jasmine is 
// describe("Description for a suite of tests", function{ 
  // it("What the test tests for", function(){
    // expect(somevalue).toBe(expectedvalue)
  // })  
//contains your tests called specs })

browser.ignoreSynchronization = true;

// describe('TestComponent', () => {
//     let component: TestComponent;
//     let fixture: ComponentFixture<TestComponent>;
//     let el: DebugElement;

//     beforeEach(() => {
//         fixture = TestBed.createComponent(TestComponent);
//         component = fixture.componentInstance;
//         el = fixture.debugElement;
//         fixture.detectChanges();
//     });

//     it('should display "a new nation" as bold text', () => {
//         const boldText = el.query(By.css('p')).nativeElement;
//         expect(boldText.innerHTML).toContain('<b>a new nation</b>');
//     });
// });

// describe: the suite of tests
describe("Lister page suite", function() {

    it("Should should get first tab", function(){
        browser.get("http://localhost:4200/Lister")
        firstTab = element(by.className("active tabs"))
        expect(firstTab.getText()).toBe("Create Listing")
    });

    it("Should should get second tab", function(){
        browser.get("http://localhost:4200/Renter")
        secondTab = element(by.className("active tabs"))
        // fTab = firstTab.nativeElement;
        expect(secondTab.getText()).toBe("Listings")
    });

    // searchbar = element(by.name("q")).sendKeys("amiibo")

    
    // let el = fixture.debugElement.query(By.css('.boxText'));
    // let spanEl = el.nativeElement;
    // // spanEl.innerHTML => give you the value
    // // and test like normally
    
    // expect(spanEl.innerHTML).toContain(component.model.number);
    

    
    // it("Should go to amiibo results", function(){
    //     searchbar = element(by.name("q")).sendKeys("amiibo")
    //     magnifyingglass = element(by.className("searchSubmitButton mat-button mat-icon-button ng-star-inserted"))
    //     magnifyingglass.click()
    //     browser.sleep(2000)
    //     expect(browser.getTitle()).toBe("Google Express - amiibo")
    //     browser.sleep(2000)
    // });
});

// the advantage to using protractor is that it is designed specifically to 
// test angular apps
// you have selectors for angular specific features like getting elements 
// by their ngmodel