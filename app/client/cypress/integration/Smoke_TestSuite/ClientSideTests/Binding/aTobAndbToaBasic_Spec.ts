import { ObjectsRegistry } from "../../../../support/Objects/Registry"

let dataSet: any;
let agHelper = ObjectsRegistry.AggregateHelper,
    ee = ObjectsRegistry.EntityExplorer,
    jsEditor = ObjectsRegistry.JSEditor,
    locator = ObjectsRegistry.CommonLocators;
    
describe("Validate basic binding of Input widget to Input widget", () => {

    before(() => {
        cy.fixture('inputBindingdsl').then((val: any) => {
            agHelper.AddDsl(val)
        });

        cy.fixture("testdata").then(function (data: any) {
            dataSet = data;
        });
    });

    it("1. Input widget test with default value for atob method", () => {
        ee.expandCollapseEntity("WIDGETS")
        ee.SelectEntityByName("Input1")
        jsEditor.EnterJSContext("defaulttext", dataSet.atobInput + "}}");
        agHelper.ValidateNetworkStatus('@updateLayout')
    });

    it("2. Input widget test with default value for btoa method", function () {
        ee.SelectEntityByName("Input2")
        jsEditor.EnterJSContext("defaulttext", dataSet.btoaInput + "}}");
        agHelper.ValidateNetworkStatus('@updateLayout')
    });

    it("3. Publish and validate the data displayed in input widgets value for aToB and bToa", function () {
        agHelper.DeployApp()
        cy.get(locator._inputWidgetInDeployed).first().invoke("attr", "value")
            .should("contain", "A")
        cy.get(locator._inputWidgetInDeployed).last().invoke("attr", "value")
            .should("contain", "QQ==");
    });
});