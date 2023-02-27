## Automation tests for www.pegasas
### Link to the page - [www.pegasas.lt](https://www.pegasas.lt)

### **Register**
- Test 1 (makeNewAccount)

*Try to make new account with existing info*
1. Open register/login;
2. Click on "Sukurti paskyra";
3. Input email(gigigi@gmail.com);
4. Input password (Books555), make it visible;
5. Confirm password (Books555), make it visible;
6. Click on check box "Susipazinau su privatumo politika";
7. Click "Login" button;
8. Check if account status changed; 

Expected result: account status changed to "Mano paskyra".

### **Login**
- Test 2 (logInWithNonExistingAccount)

*Try to log in with non-existing account information*
1. Open login;
2. Input email (tokioemailnera@yahoo.com) and password (nezinau);
3. Make password visible (click on eye);
4. Click "Login" button;
5. Check if alert message is "Prisijungimo duomenys neteisingi arba jūsų paskyra laikinai yra atjungta. Prašome pabandyti prisijungti vėliau.";

Expected result: the message "Prisijungimo duomenys neteisingi arba jūsų paskyra laikinai yra atjungta. Prašome pabandyti prisijungti vėliau." appears;

### **Cart**
- Test 3 (addingProductToCart)

*Try to add the book to cart*
1. Click on "Knygos"
2. Click on "Naujos knygos"
3. Click on "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija"
4. Click on "Ideti i krepseli"
5. Click on "Perziureti krepseli"
6. Check if the book "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija" is in the cart

Expected result: the book "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija" is in the cart.

### **Sorting products by max discount**
- Test 4 (sortingProductsByMaxDiscount)

*Try to sort the products by max discount*

1. Click on "Knygos";
2. Click on "Vaiku ir jaunimo literatura";
3. Click on "Prekiu rikiavimas";
4. Click on "Didziausia nuolaida";
5. Check if the book are sorted by max discount;

Expected result: the books are sorted by max discount.

### **GiftCard**
- Test 5 (addingGiftCardToCart)

*Try to add the book form new books to cart*
1. Click on "Dovanu kuponai";
2. Click on "El. dovanų kuponas vaikiškas (tamsus)";
3. Click on "5,00 Eur";
4. Click on "Ideti i krepseli";
5. Click on "Perziureti krepseli";
6. Check if he gift card "El. dovanų kuponas vaikiškas (tamsus)" is in the cart;

Expected result: the gift card "El. dovanų kuponas vaikiškas (tamsus)" is in the cart.

