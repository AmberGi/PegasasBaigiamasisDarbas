## Automation tests for www.pegasas
### Link to the page - [www.pegasas.lt](https://www.pegasas.lt)

### **Register**
- Test 1 (testMakeNewAccountWithAlreadyUsedEmail)

*Try to create new account with already used email*
1. Open register/login;
2. Click on "Sukurti paskyra";
3. Input email(gigigi@gmail.com);
4. Input password (Books555);
5. Confirm password (Books555);
6. Click on check box "Susipazinau su privatumo politika";
7. Click "Login" button;
8. Check if message "Jau yra paskyra su šiuo elektroninio pašto adresu. Prašome prisijungti" appears; 

Expected result: the message "Jau yra paskyra su šiuo elektroninio pašto adresu. Prašome prisijungti".

### **Login**
- Test 2 (testLogInWithNonExistingAccountInformation)

*Try to log in with non-existing account information*
1. Open login/register;
2. Input email (tokioemailnera@yahoo.com)
3. Input password (nezinau);
4. Click "Login" button;
5. Check if alert message "Prisijungimo duomenys neteisingi..." apears;

Expected result: the message "Prisijungimo duomenys neteisingi..." appears;

### **Cart**
- Test 3 (testAddBookMedineKaukeToCart)

*Try to add the book "Medine kauke" to cart*
1. Click on "Knygos";
2. Click on "Naujos knygos";
3. Click on "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija";
4. Click on "Ideti i krepseli";
5. Click on "Perziureti krepseli";
6. Check if the book "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija" is in the cart;

Expected result: the book "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija" is in the cart.

Test 4 (testDeleteBookMedineKaukeFromCart)

*Try to delete the book "Medine kauke" from cart*
1. Click on "Knygos";
2. Click on "Naujos knygos";
3. Click on "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija";
4. Click on "Ideti i krepseli";
5. Click on "Perziureti krepseli";
6. Click on trash can symbol;
7. Check if the book "Algimantas Cekuolis. Medine kauke. Mano tikroji istorija" is not in the cart;

Expected result: message "The Cart Is Empty" appears.

### **Sorting products by max discount**
- Test 5 (testSortingProductsByMaxDiscount)

*Try to sort the books by max discount*
1. Click on "Knygos vaikams ir paaugliams";
2. Click on "Paaugliams ir jaunimui";
3. Click on "Prekiu rikiavimas";
4. Click on "Didziausia nuolaida";
5. Check if the book are sorted by max discount (-80%);

Expected result: the books are sorted by max discount(-80%).

### **GiftCard**
- Test 6 (testAddBlackDizainGiftCardToCart)

*Try to add gift card black dizain to cart*
1. Click on "Dovanu kuponai";
2. Click on "El. dovanų kuponas vaikiškas (tamsus)";
3. Click on "5,00 Eur";
4. Click on "Ideti i krepseli";
5. Click on "Perziureti krepseli";
6. Check if he gift card "El. dovanų kuponas vaikiškas (tamsus)" is in the cart;

Expected result: the gift card "El. dovanų kuponas vaikiškas (tamsus)" is in the cart.