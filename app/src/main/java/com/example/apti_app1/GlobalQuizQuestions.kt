package com.example.apti_app1


var ArrayQuiz = mutableListOf(
    Questions(1, "what is the ", "hello", "HI", "wow", "now", 2,"ABC1")
    ,
    Questions(2, "how is the ", "hello", "HI", "wow", "now", 2,"ABdfC")
    , Questions(3, "why is the ", "hello", "HI", "wow", "now", 2,"AfdBC")
    , Questions(4, "what is the ", "hello", "HI", "wow", "now", 2,"fdfdABC")
    , Questions(5, "what is the ", "hello", "HI", "wow", "now", 2,"AfdfBC")
    , Questions(6, "what is the ", "hello", "HI", "wow", "now", 2,"saABC")
    , Questions(7, "what is the ", "hello", "HI", "wow", "now", 2,"cxcABC")
    , Questions(8, "what is the ", "hello", "HI", "wow", "now", 2,"ABC")
    , Questions(9, "what is the ", "hello", "HI", "wow", "now", 2,"ABC")
    , Questions(10, "now is  is the ", "hello", "HI", "wow", "now", 2,"ABC")

)

var NumberSystem = mutableListOf(
    Questions(1, "If the number 33324X8 is divisible by 72, then which of the following can be the value of X? ", "2", "3", "4", "8", 3,"(C)\n" +
            "\n" +
            "72=8*9\n" +
            "\n" +
            "Check for divisibility rule of 8 and 9.\n" +
            "\n" +
            "Sum of digits =3+3+3+2+4+x+8=23+x is divisible by 9 if x=4 and last three digits 4x8 are divisible by 8 if x=4.")
    ,
    Questions(2, "What is the digit in the unit place of 2^51", "2", "8", "1", "4", 2,"(B) unit's digit of 2^51 =8\n" + "(51/4-3 is remainder so 2^3-8)")
    , Questions(3, "What is the greatest number that divides 167 and 196 and leaves the same remainder is each case?", "23", "29", "31", "37", 2,"Since the remainders must be same,\n" + "the difference of pair of given numbers would be the required number i.e., 196-167-29")
    , Questions(4, "If 1/4th of 1/2 is added to 3/4th of 1/2 then what is the resultant value?", "0.25", "0.40", "0.45", "0.50", 4,"(1/4 x 1/2) + (3/4 x 1/2) = 1/8 + 3/8 = 4/8 = 1/2 = 0.5")
    , Questions(5, "What must be added to 12345677 to make it exactly divisible by 8?", "3", "2", "5", "4", 1,"To check if a number is divisible by 8, we check if the last three digits of the number is divisible by 8.\n" +
            "\n" +
            "When we divide the number formed by the last three digits from the given number, 677, by 8, we get a remainder 5.\n" +
            "\n" +
            "Hence, if we add 3 to the number, it will be exactly divisible by 8.\n" +
            "\n" +
            "So, option A is correct.")
    , Questions(6, "In a church 5 bells toll at intervals of 5 min, 6 min, 3 min. 2 min and 1 min respectively. If all bells start ringing at 8 A.M, then by 10 A.M. how many times they all would tolled together?", "3", "5", "2", "7", 2,"LCM (5,6,3,2,1) =30\n" +
            "\n" +
            "For every 30 minutes they tolled together\n" +
            "\n" +
            "i.e., at 8,8:30,9:00,9:30,10:00 so total 5 times")
    , Questions(7, "A number when divided by 342 gives a remainder 216. The same number when divided by 19 shall give a remainder Y. What is the value of Y?", "7", "8", "9", "10", 1,"On dividing the given number by 342,let K be the Quotient and 216 is remainder\n" +
            "\n" +
            "Then number=342k+216\n" +
            "\n" +
            "=(19x18K+19x11+7)\n" +
            "\n" +
            "=19(18K+11)+7\n" +
            "\n" +
            "The given number when divided by 19 gives 18K+11 as quotient and 7 as reminder")
    , Questions(8, "Find the greatest number which divides 92, 161, 253 exactly.", "46", "11", "23", "None of the above", 3,"HCF (92,161,253)\n" +
            "\n" +
            "-HCF (161-92,253-161,253-92)\n" +
            "\n" +
            "=HCF (69,92,161) =23")
    , Questions(9, "The LCM of two nymbers is 48. The numbers are in the ratio 2:3. Then sum of the number is:", "40", "50", "60", "35", 1,"Let the number be 2x and 3x\n"+"Then, their LCM = 6x\n"+"So, 6x = 48 or x = 8\n"+"The numbers are 16 and 24\n"+"Hence, required sum = [16 + 24] = 40")
    , Questions(10, "Which of the following has the most number of divisors?", "99", "101", "182", "176", 4,"99 = 1x3x3x11\n"+"101 = 1x101\n"+
            "176 = 1x2x2x2x2x11\n"+"182 = 1x2x7x13\n"+"So, divisors of 99 are 1,3,9,11,33,99\n"+
            "Divisors of 101 are 1 and 101\n"+
            "Divisors of 176 are 1,2,4,8,11,16,22,44,88 and 176\n"+"" +
            "Divisors of 182 are 1,2,7,13,14,26,91, and 182.\n"+"Hence, 176 has the most number of divisors")

)


var Trains = mutableListOf(
    Questions(1, "A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?", "120 metres", "180 metres", "324 metres", "150 metres", 4,"Speed = (60 x 5/18) m/sec = 50/3 m/sec.\n" +
            "Length of the train = (Speed x Time).\n" +
            " Length of the train = ( (50/3) x 9 ) m = 150 m.\n"
    )
    ,
    Questions(2, "\t\n" +
            "A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:", "45 km/hr", "50 km/hr", "54 km/hr", "55 km/hr", 2,"Speed of the train relative to man = 125/10 m/sec\n" +
            "   =  25/2 m/sec.\n" +
            "   = 25/2 x 18/5 km/hr\n" +
            "   = 45 km/hr.\n" +
            "Let the speed of the train be x km/hr. Then, relative speed = (x - 5) km/hr.\n" +
            " x - 5 = 45\n"+        "  x = 50 km/hr.")
    , Questions(3, "The length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:", "200 m", "225 m", "245 m", "250 m", 3,"Speed = ( 45 x 5/18 ) m/sec =  25/2 m/sec.\n" +
            "Time = 30 sec.\n" +
            "Let the length of bridge be x metres.\n" +
            "Then, (130 + x)/30 =\t25/2\n" +
            " 2(130 + x) = 750\n" +
            " x = 245 m.")
    , Questions(4, "Two trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:",
        "1 : 3", "3 : 2", "3 : 4", "None of these", 2,"Let the speeds of the two trains be x m/sec and y m/sec respectively.\n" +
                "Then, length of the first train = 27x metres,\n" +
                "and length of the second train = 17y metres.\n" +
                "\t(27x + 17y)/(x+y)\t= 23\n" +
                " 27x + 17y = 23x + 23y\n" +
                " 4x = 6y\n" +
                "\tx/y\t=\t3/2\t.\n" )
    , Questions(5, "A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr, what is the length of the platform?",
        "120 m", "240 m", "300 m", "None of these", 2,"Speed =\t\t(54 x\t5/18)\tm/sec = 15 m/sec.\n" +
                "Length of the train = (15 x 20)m = 300 m.\n" +
                "Let the length of the platform be x metres.\n" +
                "Then,\t(x + 300)/36\t= 15\n" +
                " x + 300 = 540\n" +
                " x = 240 m.")
    , Questions(6, "A train 240 m long passes a pole in 24 seconds. How long will it take to pass a platform 650 m long?",
        "65 sec", "89 sec", "100 sec", "150 sec", 2,"Speed = 240/24 m/sec = 10 m/sec.\n" +
                " Required time =\t\t(240 + 650)/10\tsec = 89 sec.")
    , Questions(7, "Two trains of equal length are running on parallel lines in the same direction at 46 km/hr and 36 km/hr. The faster train passes the slower train in 36 seconds. The length of each train is:",
        "50 m", "72 m", "80 m", "82 m", 1,"Let the length of each train be x metres.\n" +
                "Then, distance covered = 2x metres.\n" +
                "Relative speed = (46 - 36) km/hr\n" +
                "   =\t\t10 x\t5/18\tm/sec\n" +
                "   =\t\t25/9\tm/sec\n" +
                "\t2x/36\t=\t25/9\n" +
                " 2x = 100\n" +
                " x = 50.")
    , Questions(8, "A train 360 m long is running at a speed of 45 km/hr. In what time will it pass a bridge 140 m long?",
        "40 sec", "42 sec", "45 sec", "48 sec", 1,"Formula for converting from km/hr to m/s:   X km/hr =\t\t(X x\t5/18)\t\tm/s.\n" +
                "Therefore, Speed =\t\t(45 x\t5/18)\tm/sec\t=\t25/2\tm/sec.\n" +
                "Total distance to be covered = (360 + 140) m = 500 m.\n" +
                "\n" +
                "Formula for finding Time =\t\tDistance/Speed\t\n" +
                " Required time =\t\t(500 x 2)/25\tsec\t= 40 sec.\n" )
    , Questions(9, "Two trains are moving in opposite directions @ 60 km/hr and 90 km/hr. Their lengths are 1.10 km and 0.9 km respectively. The time taken by the slower train to cross the faster train in seconds is:",
        "36", "45", "48", "49", 3,"Relative speed = (60+ 90) km/hr\n" +
                "   =\t\t150 x\t5/18\tm/sec\n" +
                "   =\t\t125/3\tm/sec.\n" +
                "Distance covered = (1.10 + 0.9) km = 2 km = 2000 m.\n" +
                "Required time =\t\t2000 x\t3/125\tsec = 48 sec.\n" )
    , Questions(10, "A jogger running at 9 kmph alongside a railway track in 240 metres ahead of the engine of a 120 metres long train running at 45 kmph in the same direction. In how much time will the train pass the jogger?",
        "3.6 sec", "18 sec", "36 sec", "72 sec", 3,"Speed of train relative to jogger = (45 - 9) km/hr = 36 km/hr.\n" +
                "   =\t\t(36 x\t5/18)\tm/sec\n" +
                "   = 10 m/sec.\n" +
                "Distance to be covered = (240 + 120) m = 360 m.\n" +
                " Time taken =\t\t360/10\tsec\t= 36 sec.\n" )

)

var TimeWork = mutableListOf(
    Questions(1, " A can do a bit of work in 8 days, which B alone can do in 10 days in how long . In how long both cooperating can do it?",
        "40/9 days", "41/9 days", "42/9 days", "43/9 days", 1,"A's 1 day work= 1/8, B`s 1 day work = 1/10\n" +
                "∴ (A+B) 1 day work = (1/8+1/10) = 9/40\n" +
                "Both cooperating can complete it in 40/9 days.")
    ,
    Questions(2, "A and B together can dive a trench in 12 days, which an alone can dive in 30 days. In how long B alone can burrow it?",
        "18 days", "19 days", "20 days", "21 days", 3,"(A+B)'s 1 day work = 1/12, A's 1 day work =1/30 \n" +
                "∴ B's 1 day work = (1/12-1/30) = 3/60 = 1/20 \n" +
                "Henceforth, B alone can dive the trench in 20 days.")
    , Questions(3, "A can do a bit of work in 25 days which B can complete in 20 days. Both together labor for 5 days and afterward A leaves off. How long will B take to complete the remaining work?",
        "7 days", "8 days", "9 days", "11 days", 4,"(A+B)'s 5 days work = 5(1/25+1/20) = (5*9/100) = 9/20 \n" +
                "Remaining work = (1-9/20) = 11/20 \n" +
                "1/20 work is finished by B in 1 day \n" +
                "11/20 work is finished by B in (1*20*11/20) = 11 days")
    , Questions(4, "A and B can do a bit of work in 12 days. B and C can do it in 15 days while C and A can do it in 20 days. In how long will they complete it cooperating? Additionally, in how long can A alone do it?",
        "10 days, 30 days", "15 days, 20 days", "20 days, 40 days", "10 days, 50 days", 1,"(A+B)'s 1 day work = 1/12, \n" +
                "(B+C)'s 1 day work = 1/15,\n" +
                "(C+A)'S 1 day work = 1/20 \n" +
                "Including: 2(A+B+C)'s 1 day work = (1/12+ 1/15+ 1/20)= 12/60 = 1/5 \n" +
                "∴ (A+B+C) `s 1 day work = (1/2 *1/5) = 1/10 \n" +
                "∴ working together they can complete the work in 10 days. \n" +
                "A's 1 day work = (1/10-1/15) = 1/30, B`s 1 day work = (1/10-1/20) = 1/20 \n" +
                "C's 1 day work = (1/10-1/12) = 1/60 \n" +
                "∴ A alone can take the necessary steps in 30 days.")
    , Questions(5, "A can fabricate a divider in 30 days , while B alone can assemble it in 40 days, If they construct it together and get an installment of RS. 7000, what B's offer?",
        "2000", "3000", "4000", "6500", 2,"A's 1 days work = 1/30,\n" +
                "B's 1 day work = 1/40,\n" +
                "Proportion of their shares = 1/30:1/40 = 4:3\n" +
                "B's offer = (7000*3/7) = Rs. 3000")
    , Questions(6, "A can do a bit of work in 10 days while B alone can do it in 15 days. They cooperate for 5 days and whatever remains of the work is finished by C in 2 days. On the off chance that they get Rs. 4500 for the entire work, by what means if they partition the cash?",
        "Rs 1250, Rs 1200, Rs 550", "Rs 2250, Rs 1500, Rs 750", "Rs 1050, Rs 1000, Rs 500", "Rs 650, Rs 700, Rs 500", 2,"(A+B)'s 5 days work = 5(1/10+ 1/15)= (5* 1/6)= 5/6 \n" +
                "Remaining work = (1-5/6) = 1/6 \n" +
                "C's 2 days work = 1/6 \n" +
                "(A's 5 day work): (B's 5 day work): (C's 2 days work) \n" +
                "= 5/10: 5/15: 1/6 \n" +
                "= 15: 10:5 = 3:2:1 \n" +
                "A's offer = (4500*3/6) = Rs. 2250\n" +
                "B's offer = (4500*2/6) = Rs. 1500 \n" +
                "C's share= (4500*1/6) = Rs. 750")
    , Questions(7, "Kamal can do a work in 15 days. Bimal is half more proficient than kamala. The no. of days, Bimal will take to do likewise bit of work, is",
        "10", "21/2", "12", "14", 1,"Kamal 1 day work=1/5.\n" +
                "Bimal 1 days work=150% of 1/15=150/100*1/15 =1/10.\n" +
                "∴Bimal can finish the work in 10 days.")
    , Questions(8, "3 men or 5 ladies can do a work in 12 days. To what extent will 6 men and 5 ladies take to complete the work?",
        "4 days", "10 days", "15 days", "20 days", 1,"3 men =5 women ⇒(6 men +5 women )=15 women\n" +
                "Now, 5 women can do it in 12 days.\n" +
                "1 woman can do it in (12*5) days.\n" +
                "15 women can do it in 12*5/15days=4days.")
    , Questions(9, "A can do a bit of work in 20 days which B can do in 12 days. B worked at it for 9 days. A can complete the remaining work in:",
        "3 days", "5 days", "7 days", "11 days", 2,"B's 9 days work = (1/12*9)= 3/4\n"+
                "remaining work = (1-3/4 )= 1/4 1/20 work is finished by A in 1 day.\n"+
                "1/4 works is finished by A in (20*1/4) days. =5 days")
    , Questions(10, "A can do a bit of work in 14 days which B can alone do in 21 days. They start together however 3 days before the fruition of the work, A leaves off. The aggregate no. of days for the work to be finished is",
        "33/5 days", "17/2 days", "51/5 days", "27/2 days", 3,"B's 3 days work = (3*1/21)= 1/7 ; Remaining work = (1-1/7) = 6/7\n" +
                "   (A+B)'s 1 day?s work = (1/14+ 1/21) = 5/42\n" +
                "5/42 work is finished by (A+B) in 1 day.\n" +
                "6/7 work is finished by (A+B) in (42/5 * 6/7) days = 36/5 days\n" +
                " Total no. of days = (3+36/5) = 51/5 days.")

)

var profitLoss= mutableListOf(
    Questions(1, "A man offers his at 5% misfortune. On the off chance that he offers it for Rs. 80 more, He picks up 5%. The expense cost of the is:",
        "1600", "1200", "1000", "800", 4,"Let the C.P. be Rs x.Then,\n" +
                "(105/100 * x)- (95/100 * x)=80⇒21x/20-19x/20=80\n" +
                "⇒ (21x-19x) =1600⇒ 2x=1600⇒ x=800\n" +
                "∴C.P. Rs 800.")
    ,
    Questions(2, "By offering 100 penciled, a businessperson picks up the offering cost of 20 Pencils. His addition percent is:",
        "25 %", "20 %", "15 %", "12 %", 1,"Let the C.P of each pencil be rupee.1\n" +
                "(S.P of 100 pencils) - (C.P of 100 pencils) = gain= S.P of 20 pencil\n" +
                "⇒ S.P of 80 pencils= C.P of 100 pencils= 100\n" +
                "∴ C.P Of 80 pencils = Rs. 80 and S.P= 100 Rs.\n" +
                "Gain % = (20/80 *100) = 25%")
    , Questions(3, "In the event that offering cost is multiplied, the benefit triples. The benefit percent is:",
        "200/3 %", "100 %", "316/3 %", "120 %", 2,"Let C.P is Rs. x and S.P be Rs. y.\n" +
                "Then, profit = Rs. (y-x)\n" +
                "Again, S.P = Rs. 2y and profit = Rs. (y-x)\n" +
                "C.P = (S.P) ? (profit) =   rs.  3(y-x)\n" +
                "C.P = (S.P) - (profit) = 2y-3(y-x) = 3x-y\n" +
                "∴ 3x-y= x ⇒ y= 2x\n" +
                "⇒ Profit%= (x/x*100) % = 100%")
    , Questions(4, "A man sold two steel seats for Rs. 500 each. On one, he increases 20% also, on the other, he loses 12%. The amount of does he pick up or misfortune in the entire exchange?",
        "1.5% pick up", "2% pick up", "1.5% lose", "2% misfortune", 3,"S.P of two chairs = (500*2) =1000\n" +
                "C.P of these chairs = [(100/120*500) + (100/88*500)]\n" +
                "= (1250/3 +6250/11) = 32500/33\n" +
                "Gain = (1000-32500/33) =Rs. 500/33\n" +
                "⇒ Gain % = (500/33*33/32500*100) % = 1.5% loss")
    , Questions(5, "What is the selling price of a toy? If the cost of the toy is Rs. 90 and a profit of 15% over selling price is earned?",
        "103.5", "101.5", "107", "115", 1,"Cost price + profit = Selling Price\n" +
                "Cost price is Rs. 90\n" +
                "Profit is 15% of Cost Price=13.5\n" +
                "Selling Price = CP + Profit\n" +
                "=90+13.5 = 103.5\n" +
                "SP is Rs. 103.5")
    , Questions(6, "A vendor bought toffees at 8 for one rupee. How many for a rupee must he sell to gain 25%?",
        "16", "14", "12", "10", 4,"C.P. of 8 toffees = Re. 1\n" +
                "S.P. of 8 toffees = 125% of Re. 1 = Rs 1.25=5/4\n" +
                "For Rs5/4 toffees sold = 8.\n" +
                "For Re. 1, toffees sold =8x( 5)/( 4)=10.\n")
    , Questions(7, "A merchant pronouncing to offer his products at expense value/utilizes 900 gm Weight for 1 kg. His increase percent is:",
        "9 %", "10 %", "11 %", "100/9 %", 4,"Shot Cut Method:\n" +
                "Gain%= [(error)/ (true value)- (error)*100]%\n" +
                "= (100/900*100)%\n" +
                "= 100/9%")
    , Questions(8, " The whole of three square of three no. which are in the proportion 2:3:4 is 725. What are three numbers?",
        "10 ,15, 20", "14, 21, 28", "20 ,15, 30", "20, 30, 40", 1,"Let the numbers be 2x, 3x and 4x. Then,\n" +
                "      4x2 +9x2 +16x2 = 725  \n" +
                "=> 29x2  =725 \n" +
                " x2 = 25 \n" +
                "=> x =5\n" +
                "      ∴ The numbers are 10, 15, 20 .")
    , Questions(9, "The stamped cost of a shirt and trousers are in the proportion 1:2. The businessperson gives 40% markdown on the shirt. On the off chance that the aggregate markdown on both is 30%, the markdown offered on trousers is:",
        "15 %", "20 %", "25 %", "30 %", 3,"Let The M.P Of shirt be Rs. x and that of trousers be rs. 2x.\n" +
                "Let y% be the discount on trousers. Then,\n" +
                "60/100*x+ (100-y)/100*2x=  70/100*(x+2x)\n" +
                "⇒3/5+(100-y)/50 = 21/10  ⇒ (100-y)/50  = (21/10-3/5)= 15/10=3/2\n" +
                "⇒  (100-y)= (3/5*50)= 75 ⇒ y=25\n" +
                "∴ discount on trousers = 25%")
    , Questions(10, "A retailer offers his clients 10% rebate and still makes a benefit of 26% . What is the genuine expense of an article for him checked Rs. 280?",
        "175", "200", "215", "225", 2,"M.P = Rs.280 , S.P= rs. (90/100*280) = 252\n" +
                "S.P = Rs. 252, gain = 26%\n" +
                "\n" +
                "C.P.=Rs (100/126*252)=Rs 200.")

)

var Percentage= mutableListOf(
    Questions(1, "Half of 1% written as a decimal is :", "0.005", "5", "0.5", "0.005", 4,"Half of 1% = (1⁄2 x 1⁄100)\n" +
            "= 0.5⁄100 = 0.005 %\n")
    ,
    Questions(2, "The sum of two numbers is 28⁄25 of the first number. The second number is what percent of the first?",
        "25 %", "11 %", "12 %", "None of these", 3,"Let p and q be the numbers, then\n" +
                "p + q = 28⁄25p\n" +
                "q = 28⁄25p - p\n" +
                "q = 3⁄25p\n" +
                "q⁄p = 3⁄25\n" +
                "For percentage: q⁄p = 3⁄25 x 100\n" +
                " = 12%")
    , Questions(3, "Two numbers A and B are such that the sum of 5% of A and 4% of B is two-third of the sum of 6% of A and 85 of B. Fin the ratio of A:B.",
        "4 : 3", "3 : 4", "6 : 5", "5 : 6", 1,"5⁄100A + 4⁄100B = 2⁄3 (6⁄100A + 8⁄100B)\n" +
                "1⁄20A + 1⁄25B = 1⁄25A + 4⁄75B\n" +
                "A⁄B = 4⁄3")
    , Questions(4, "If m% of m is 36, then m is?",
        "70", "64", "50", "60", 4,"→ Z% of Z = 36\n" +
                "Therefore, (Z⁄100)x Z = 36\n" +
                "Z = 60")
    , Questions(5, "A salesman is allowed 51⁄2% discount on the total sales made by him plus a bonus of 1⁄2% on the sales over Rs. 10000. If his total earnings were Rs. 1990, then his total sales in Rs. were?",
        "Rs. 39000", "Rs. 35000", "Rs. 34000", "Rs. 38000", 3,"Let z be the total sales.\n" +
                "Then, 51⁄2% of z + 1⁄2% of (z - 10000) = 1990\n" +
                "→ 12z - 10000 = 398000\n" +
                "z = Rs. 34000")
    , Questions(6, "If the side of a square is increased by 25%, its area is increased by",
        "56.25%", "53%", "56%", "54.25%", 1,"Let side =100m\n" +
                "Area = 100*100=10000 m2\n" +
                "New area =125*125=15625 m2\n" +
                "Increase in area =\n" +
                "5625/10000*100=56.25%")
    , Questions(7, "By how much is 35 % of 81 is greater then 80% of 25.",
        "8.00", "8.25", "8.35", "8.5", 3,"It is 35/100*81  -  80/100*25=8.35")
    , Questions(8, "A student who secures 30% marks in an exam fails by 30 marks .Another student who secures 35% marks gets 42 marks more than required to pass .the percentage of marks required is",
        "32.08%", "22.05%", "29.33%", "35%", 1,"30% of x + 30= 35% of x -42\n" +
                "Or 5% of x =72\n" +
                "=>x=1440\n" +
                "Pass marks =30% of 1440 +30=432+30=462\n" +
                "Pass percentage = 462/1440*100=32.08% ")
    , Questions(9, "0.05 is how many percent of 20?",
        "25%", "2.5%", "0.25%", "0.025%", 2," Let's have x % of 20 = 0.05\n" +
                "=> x/100 * (20) = 5/100 \n" +
                "=>x = 5 /20 \n" +
                "= 0.25%")
    , Questions(10, "After spending 15% on raw material, 30 % on machinery, 15% on furniture, 10% on machinery, Harish had a balance of 1300. The money with him was:",
        "3568", "4010", "3952", "4333", 4,"x-(15% of x+30% of x+15% of x+10% of x)=1300\n" +
                "x-70% of x=1300\n" +
                "=>x=4333")

)

var Calendar= mutableListOf(
    Questions(1, "w What was the week's day on fourth June, 2002?",
        "Tuesday", "Sunday", "Monday", "Friday", 1,"4Th.june, 2002 = (2001 years+ period from 1.1.2002 to. 4.6.2002.\n" +
                "Odd days in 1600 years = 0\n" +
                "Odd days in 400 years = 0\n" +
                "Odd days in 1 customary years = 1\n" +
                "\n" +
                "Odd days in 2001 years = (0+0+1)=1\n" +
                "\n" +
                "Jan + Feb. +March +April+ May +June\n" +
                "(31 + 28 +31+ 30 + 31 +4 = 155 days=22 weeks +1 day = 1 odd days\n" +
                "\n" +
                "Aggregate no. of odd days = (1+1) = 2\n" +
                "∴ required day is Tuesday.\n")
    ,
    Questions(2, "What was the week's day on sixteenth July, 1776?",
        "Wednesday", "Tuesday", "Friday", "Saturday", 2,"16 July, 1776 \n" +
                "= (1775 years + period from 1.1.1776 to 16.7.1776.\n" +
                "Checking of odd days.\n" +
                "No. of odd days in 1600 years =0 \n" +
                "No. of odd days in 100 years = 5 \n" +
                "\n" +
                "75 years= 18 jump years+57 conventional years\n" +
                "= (18*2+57*1) odd days = 93 odd days\n" +
                "= (13 weeks +2 days) = 2 odd days.\n" +
                "∴ 1775 years have= (0+5+2) odd days= 7 days= 0 days\n" +
                "\n" +
                "Jan + Feb. + March + April + May + June + July\n" +
                "31 +29 + 31 + 30 + 31 + 30 +16 = 198 days\n" +
                "\n" +
                "198 days = (28 weeks+2 days) = 2 odd days\n" +
                "=Total no. of odd days = (0+2) = 2\n" +
                "\n" +
                "Thus, the required day is Tuesday.")
    , Questions(3, "Jan.1 2008 is Tuesday. What date of the week lies on Jan 1, 2009?",
        "Monday", "Wednesday", "Thursday", "Friday", 3,"The year 2008 is a jump year.\n" +
                "So, it has 2 odd days.\n" +
                "First day of the year 2008 is Tuesday (Given).\n" +
                "\n" +
                "In this way, first day of the year 2009 is \n" +
                "2 days past Tuesday.\n" +
                "Subsequently, it will be Thursday.")
    , Questions(4, "On sixth March, 2005 Monday falls. What was the day of the week on sixth March, 2004?",
        "Sunday", "Saturday", "Tuesday", "Wednesday", 2,"The year 2004 is a jump year. \n" +
                "In this way, it has 2 odd days.\n" +
                "∴ The day on sixth March, 2005 will be 2 days.\n" +
                "\n" +
                "past the day on sixth Walk, 2004.\n" +
                "Yet, sixth March, 2005 is Monday.\n" +
                "∴ sixth March, 2004 is Saturday.")
    , Questions(5, "on what dates of April, 2001 did Wednesday fall?",
        "1st, 8th, 15th, 22nd 29th", "2nd, 9th, 16th, 23rd, 30th", "3rd, 10th, 17th, 24th", "4th, 11th, 18th, 25th", 4,"We might discover the day on first April, 2001.\n" +
                "First April , 2001=(2000 year + Period structure 1.1.2001 to 1.4.2001)\n" +
                "Odd days in 1600 years =0.\n" +
                "Odd days in 400 year =0.\n" +
                "\n" +
                "Jan Feb March April\n" +
                "31 + 28 + 31 + 1 = 91 days =0 odd day.\n" +
                "\n" +
                "Aggregate number of odd days= (0+0+0) =0.\n" +
                "\n" +
                "On first April, 2001 it was Sunday.\n" +
                "In April, 2001 Wednesday falls on 4th, 11th, 18th and 25th.")
    , Questions(6, "What was the week's day on 28th may, 2006?",
        "Thursday", "Friday", "Saturday", "Sunday", 4,"28.May,2006 =(2005 years +Period structure 1.1.2006 to 28.5.2006)\n" +
                "Odd days in 1600 years=0.\n" +
                "Odd days in 400 years = 0.\n" +
                "\n" +
                "5 years = (4 common years+ 1 jump years)=(4*1+1*2)odd days\n" +
                "= 6 odd days.\n" +
                "\n" +
                "Jan + Feb. + March + April + May\n" +
                "31 + 28 + 31 + 30 + 28 =148 days.\n" +
                "\n" +
                "148 days = (21 weeks+1 day) = 1 odd day\n" +
                "Aggregate no. of odd days = (0+0+6+1) = 7= 0 odd day.\n" +
                " \n" +
                "Given day is Sunday.")
    , Questions(7, "The last day of a century can't be:",
        "Monday", "Wednesday", "Tuesday", "Friday", 3,"100 years contain 5 odd days.\n" +
                "∴ Last day of first century is Friday. \n" +
                "\n" +
                "200 years contain (5*2) = 3 odd days.\n" +
                "∴ Last day of second century is Wednesday.\n" +
                "\n" +
                "300 year contain (5*3) =15=1 odd day.\n" +
                "∴ Last day of third century is Monday.\n" +
                "\n" +
                "400 year contain 0 odd days.\n" +
                "∴ Last day of fourth century is Sunday.\n" +
                "\n" +
                "The cycle is repeated.\n" +
                "∴ Last day of a century can't be Tuesday or Thursday or Saturday.")
    , Questions(8, "Which of the accompanying is not a leap year?",
        "700", "800", "1200", "2000", 1,"The century divisible by 400 is a leap year.\n" +
                "∴ The year 700 is not a jump year.")
    , Questions(9, "On eighth Feb, 2005 it was Tuesday. What was the week's day on eighth Feb, 2004?",
        "Tuesday", "Monday", "Sunday", "Wednesday", 3,"The year 2004 is a jump year. \n" +
                "It has 2 odd days.\n" +
                "∴ The day on eighth Feb,2004 is 2 days before the day.\n" +
                "\n" +
                "On eighth Feb, 2005.\n" +
                "Henceforth This day is Sunday.")
    , Questions(10, "The calendar for the year 2007 will be the same for the year:",
        "2014", "2016", "2017", "2018", 4,"Count the number of odd days from the year 2007 onwards to get the sum equal to 0 odd day.\n" +
                "\n" +
                "Year    : 2007 2008 2009 2010 2011 2012 2013 2014 2015 2016 2017\n" +
                "Odd day : 1    2    1    1    1    2    1    1    1    2    1    \n" +
                "Sum = 14 odd days  0 odd days.\n" +
                "\n" +
                " Calendar for the year 2018 will be the same as for the year 2007.")

)

var Clock= mutableListOf(
    Questions(1, "Find the angle between the hour hand and the minute hand of a clock when the time is 3.25.",
        "30°", "50°", "95/2°", "None of these", 3,"Angle traced by the hour hand in 12 hours = 360°\n" +
                "Angle traced by it 3 hr 25 minutes i.e 41/12 hrs\n" +
                "= 360°/12 * 41/12 = 105°/2\n" +
                "Similarly, angle traced by min hand in 60 mins = 360°\n" +
                "Angle traced by it in 25 mins = 3600/60 * 25 = 150°\n" +
                "\n" +
                "∴ Angle between hour hand and minute hand\n" +
                "= 150° ? 105°/2\n" +
                "= 95°/2")
    ,
    Questions(2, "At what time between 4 and 5 o' clock are the hands of a clock 3 minutes apart?",
        "45.09 minutes past 4 o' clock.", "35.09 minutes past 4 o' clock.", "25.09 minutes past 4 o' clock.", "15.09 minutes past 4 o' clock.", 3,"At 4 o' clock, the minute hand is 20 min spaces behind the hour hand.\n" +
                "There are two possible cases for the given scenario.\n" +
                "\n" +
                "Case I ? Minute hand is 3 min spaces behind the hour hand.\n" +
                "In this case the minute hand has to gain (20-3) = 17 minutes.\n" +
                "= (60/55) * 17 \n" +
                "= (12/11) * 17\n" +
                "= 204/11\n" +
                "\n" +
                "∴ The minute hand will be 3 minute apart at 204/11 min or 18.54 min past 4.\n" +
                "\n" +
                "Case II ? Minute hand is 3 minutes spaces ahead of the hour hand. \n" +
                "In this case the minute hand has to gain (20+3) = 23 minute spaces.\n" +
                "= (60/55)*23\n" +
                "= (12/11)*23\n" +
                "= 276/11\n" +
                "= 25.09 minutes\n" +
                "\n" +
                "∴ The hands will be 3 minute apart at 25.09 minutes past 4 o' clock.")
    , Questions(3, "The minute hand of a clock overtakes the hour hand at interval of 65 minutes of the correct time. How much a day does the clock gain or lose?",
        "10.20 minutes in 24 hours", "10.25 minutes in 24 hours", "10.23 minutes in 24 hours", "None of these"
        , 3,"In a correct clock, the minute hand gains 55 min spaces\n" +
                "over the hour hand in 60 minutes.\n" +
                "To be together again, the minute hand must gain 60 minutes over the hour hand.\n" +
                "\n" +
                "55 min are gained in 60 min\n" +
                "60 min are gained in (60/55)*60 = 720/11\n" +
                "\n" +
                "But they are together after 65 min.\n" +
                "∴Gain in 65 min = (720/11 ? 65) = 5/11\n" +
                "\n" +
                "Gain in 24 hours = [5/11 * (60*24)/65] min\n" +
                "= 440/43 min\n" +
                "= 10.23 minutes.\n" +
                "\n" +
                "∴The clock gains 10.23 minutes in 24 hours.")
    , Questions(4, "A clock is set comfortable Am. The check loses 16 minutes in 24 hours. What will be the genuine time when the clock shows 10 pm on fourth day?",
        "11 pm", "12 pm", "11 am", "12 am", 1,"Time from 5am on a day to 10 pm on fourth day= 89 hours\n" +
                "Presently 23hrs. 44min. of this clock= 24 hours of right clock.\n" +
                "∴ 356/15 hrs of this clock= (24*15/356*89) hrs. Of right clock.\n" +
                "= 90 hrs of right clock.\n" +
                "Along these lines, the right time is 11 pm.")
    , Questions(5, "An exact check demonstrates 8 o'clock in the morning . through what number of degrees will the hour hand pivot when the clock indicates 2 O' check toward the evening?",
        "144°", "150°", "168°", "180°", 4,"Angle followed by the hour hand in 6 hours\n" +
                "= (360/12*6)°= 180°")
    , Questions(6, "The point between the moment hand and the hour hand of a clock At the point when the time is 8.30, is:",
        "80°", "75°", "60°", "105°", 2,"Angle followed by hour hand in 17/2hrs= (360/12*17/2)°= 255°\n" +
                "Point followed by min. hand in 30 min. = (360/60*30)°= 180°\n" +
                "∴ Required Angle = (255-180)°=75°")
    , Questions(7, "How commonly do the hands of a check agree in a day?",
        "20", "21", "22", "24", 3,"The hands of a check match 11 times in at regular intervals.\n" +
                "∴ The hands concur 22 times in a day.")
    , Questions(8, "What number times in a day, are the hands of a check in straight line however in bearing?",
        "22", "24", "44", "48", 1,"The hands of a check point in inverse headings 11 times in every 12 Hours.\n" +
                "(since somewhere around 5 and 7 they point in inverse headings at 6 o'clock just)\n" +
                "So in a day, the hands point in the inverse headings 22 times.")
    , Questions(9, "At what time somewhere around 7 and 8 o'clock will the hands of a be in the Same straight line at the same time, not together?",
        "5 min. Past 7", "57/11 min. past 7", "58/11 min. past 7", "60/11 min. past 7", 4,"When the check's hands are in the same straight line however not together. \n" +
                "they are 30 moment spaces separated.\n" +
                "At 7 o' clock, they are 25 min. space separated.\n" +
                "∴ Minute hand will need to increase just 5 min. spaces.\n" +
                "55 min. spaces are picked up in 60 min.\n" +
                "5 min. spaces are picked up in (60/55*5)min=60/11 min.\n" +
                "∴ Required time=60/11 min. past 7.")
    , Questions(10, "At what time somewhere around 4 and 5 o'clock will the hand of a watch point In inverse headings?",
        "45 min. past 4", "40 min. past 4", "554/11 min. past", "100/11 min. past 4", 4,"At 4 o' clock, the watch's hands are 20 min. space Separated.\n" +
                "To be in inverse directions, they must be 30 min. space Separated.\n" +
                "∴ Minute hand will need to pick up 50 min. space.\n" +
                "55 min. space are picked up in 60 min.\n" +
                "50 min. space are picked up in (60/11*50) min. on the other hand 100/11 min.\n" +
                "∴ Required time=100/11 min. past 4.")

)

var RatioProportion= mutableListOf(
    Questions(1, "If three numbers are in the ratio 3:7:11 and double the sum is 84, then the ratio of squares of the numbers is",
        "9:25:49", "9:49:121", "16:25:36", "16:25:49", 2,"Let the numbers are 3x:7x:11x\n" +
                "It is given that 2(3x+7x+11x) = 84\n" +
                " => x=2\n" +
                "Ratio 6:14:22 or 3:7:11\n" +
                " Their squares 9:49:121")
    ,
    Questions(2, "Two numbers are respectively 80% and 60% more than a third number. What is the ratio between two numbers?",
        "7:8", "8:9", "9:8", "4:3", 3,"Let the third number be x\n" +
                "=> The first and second number becomes 1.8x and 1.6x\n" +
                "Their ratio will be 1.8x/1.6x=1.8/1.6=9/8 = 9:8")
    , Questions(3, "If A:B =1:3 , B:C =5:7 , C:D =9:7 ,then A:B:C:D =?",
        "15:45:63:49", "15:49:45:63", "45:15:63:49", "49:15:45:63",
        3,"A:B = 1 :3 = 5 :15 , \n" +
                "B :C = 5:7 =15 :21 \n" +
                "and C:D = 21/9 *9 : 21/9 *7\n" +
                "A: B = 5:15 , B :C = 5:7 and C:D =21:49/3 \n" +
                "A : B :C :D = 5 :15 :21 : 49/3 \n" +
                "=> A : B :C :D = 15 :45 : 63 : 49")
    , Questions(4, "If 7:x ::17.5 :22.5 , then x=?", "5.5", "7.5", "6", "9",
        4,"X * 17.5 =7*22.5 \n" +
                "=>  X= 7*22.5/17.5 \n" +
                "= 7*225/175 =9.")
    , Questions(5, "If 20 % of (p +q )=50 % of (p-q ), then p:q =?",
        "5:7", "7:5", "7:3", "7:8", 3,"20/100* (P+Q) = 50/100* (P-Q)\n" +
                "=> 20 * (P+Q)=50 *(P-Q)\n" +
                "=> 20P +20Q = 50P-50Q\n" +
                "=> 30P=70Q \n" +
                "=> P/Q=70/30=7/3\n" +
                "=> P:Q = 7:3.")
    , Questions(6, "In a class, the no. of young women is 20% more than that of the young fellows. The class' quality is 66. If 4 more young women are admitted to the class, what will be the no's extent of young fellows to that of the young women?",
        "1:2", "1:4", "3:4", "3:5", 3,"Let the number of boys be x.\n" +
                "Then the no. of girls = 120% of x = (120/100 *X)= 6X/5 .\n" +
                "X+6x/5 =66 \n" +
                "=> 5x+6x=330\n" +
                " => 11x= 330  \n" +
                "=> x= 3\n" +
                " Now, the no. of boys= 30 , no. of girls =[6/5*30 +4]=40\n" +
                " Now the ratio of boys and girls = 30/40 = 3/4 =3:4")
    , Questions(7, "What ought to be added to each of the four numbers 6, 14, 18, 38 to make them corresponding?",
        "1", "2", "3", "4", 2,"Let the number to be added be x. Then,\n" +
                "6+X/14+x=  18+x/38+x\n" +
                "=>  (6+x) (38+x)= (14+ x) (18 +x)\n" +
                "=>  228 +44x+x<sup>2</sup> = 252+32x+x<sup>2</sup>\n" +
                "= 12x=24 \n" +
                "=>  x=2 .\n" +
                "∴ the required number is 2.")
    , Questions(8, "Three no. are in the proportion 3:4:5. The total of the biggest and the littlest measures up to the third's entirety and 52. The littlest no. is?",
        "20", "27", "39", "52", 3,"Let the numbers be 3x, 4x and 5x.\n" +
                "(5x+3x) = 4x+52  \n" +
                "=>  4x =52 \n" +
                "=>  x=13\n" +
                "  Smallest no. = (3*13) = 39")
    , Questions(9, "An entirety of cash is isolated among A, B and C in a manner that to every rs. A gets 100, B gets 65 paisa and C gets 35 paisa. If C offer is 28, the total is:",
        "120", "140", "160", "180", 3,"A:B:C=100:65:35 = 20:13:7\n" +
                "If C share is 7, sum is (20+13+7).\n" +
                "If C share is 28, sum is (40/7*28)= 160")
    , Questions(10, "Vessels An and B contain blends of milk and water in the proportion 4:5 and 5:1 separately .in what proportion ought to amounts of blends be taken From A to B to shape a blend in which drain to water is in the proportion 5:4?",
        "2:5", "2:3", "4:3", "5:2", 4,"Let the required ratio be X:1\n" +
                "Milk in x ltr. of 1st mix=  (x*4/9)= 4x/9 ltr.\n" +
                "Water in x ltr. of 1st mix= (x-4x/9)= 5x/9 ltr.\n" +
                "Milk in 1 ltr. of 2nd. Mix= 5/6 ltr.\n" +
                "Water in 1 ltr. of 2nd. Mix= {1-5/6}=1/6 ltr.\n" +
                "Milk: water =(4x/9+5/6): (5x/9+1/6) =(8x+15)/18: (10x+3)/18\n" +
                "∴ (8x+15)/(10x+3) =5/4 \n" +
                "=> 4(8x+15)= 5(10x+3)\n" +
                "= 18x=45  \n" +
                "=>x=5/2\n" +
                "Required ratio : 5/2:1 =5:2")

)

var Area= mutableListOf(
    Questions(1, "The edge of a story of a room is 18m. What is the region of four dividers of the room, if its stature is 3m?",
        "21 sq.m", "42 sq.m", "54 sq.m", "108 sq.m", 3,"Perimeter= 2 (L+b)=18 and height =3m\n" +
                "Area of 4 walls = 2(l+b)*h= (18*3) = 54 sq.m")
    ,
    Questions(2, "The length of a rectangular plot is thrice its expansiveness. On the off chance that the zone of the rectangular plot is 6075 sq. meter, what is its length?",
        "45 m", "75 m", "130 m", "none of these", 4,"Let the breadth be x meters. Then, its length= 3x mtr.\n" +
                "∴3x*x =6075 ⇒ x2 =2025 ⇒x= √2025= 45\n" +
                "∴ Length = (3*45) m= 135 m")
    , Questions(3, "If the proportion of the ranges of two squares, one having twofold it's corner to corner then the other is:",
        "2:1", "3:1", "3:2", "4:1", 4,"Let the length of the diagonals be 2x and x units.\n" +
                "Then, their areas are 1/2 *(2x)2 and (1/2*x2)\n" +
                "Required ratio: (1/2*4x2): (1/2x2) = 4:1")
    , Questions(4, "A Verandah 40m long and 15 m wide is to be cleared with stones every measuring 6dm by 5dm. The quantity of stones required is:",
        "1000", "2000", "3000", "none of these", 2,"Area of the verandah= (40*15) sq.m= 600 sq.m\n" +
                "Area of one stone= (6/10*5/10) sq.m= 3/10 sq.m\n" +
                "No. of stones = (600*10/3) = 2000")
    , Questions(5, "The length of a rectangle is twice than its broadness. On the off chance that the length of this rectangle is expanded by 5cm and broadness is diminished by 5cm, the territory of a rectangle is expanded by 75m2. The length of the rectangle is:",
        "20 cm", "30 cm", "40 cm", "50 cm", 3,"Let breadth be x cm. Then, length =2x cm\n" +
                "(2x-5) (x+5)-x*2x =75 ⇒5x= 100 ⇒x= 20\n" +
                "∴Length = (2*20) cm =40 cm")
    , Questions(6, "A circle and a rectangle have same perimeter.The side of the rectangle is 18cm and 26 cm. what is the area of the circle?",
        "88 sq.cm", "154 sq.cm", "616 sq.cm", "1250 sq.cm", 3,"Circumference of the circle= Perimeter of the rectangle\n" +
                "= 2 (18+26) cm= 88cm\n" +
                "2*22/7* R= 88 ⇒ R= (88*7/44) =14 cm\n" +
                "Area of the circle = πr2 = (22/7 *14*14) cm2 =616 cm2")
    , Questions(7, "The areas of two similar triangles are 12 cm2 and 48 cm2 .If the height of the smaller one is 2.1 cm, then the corresponding height of the bigger one is:" ,
        "0.525 cm", "4.2 cm", "4.41 cm", "8.4 cm", 2,"The areas of two similar triangles are in the ratio of the square of the corresponding sides.\n" +
                "∴12/48= (2.1)2/h2 ⇒h2=4* (2.1)2 ⇒h= (2* 2.1) = 4.2 cm")
    , Questions(8, "The stature of an equilateral triangle is √6cm. Its range is:",
        "3√3 sq.cm", "2√3 sq.cm", "2√2 sq.cm", "6√2 sq.cm", 2,"Let the base be A cm , Then,\n" +
                "1/2 a √6= (√3/4) a2⇒      a= 1/2 √6 4/√3= 2√2\n" +
                "Area of the triangle = {(√3/4* (2√2) 2} sq.cm = (√3/4*8) sq.cm\n" +
                "= 2√3 sq.cm")
    , Questions(9, "The region of a rhombus is 2016cm2 and its side is 65cm. The lengths of its diagonals are:",
        "125 cm, 35 cm", "126 cm, 32 cm", "132 cm, 26 cm", "135 cm, 25 cm" , 2,"1/2 d₁* d₂=2016 ⇒d₁*d₂=4032\n" +
                "(1/2 d₁)2+ (1/2 d₂)2 = (65)2⇒d₁2+d₂2= 16900\n" +
                "∴d₁2+d₂2+2d₁d₂ = (16900+8064) =24964 ⇒ (d₁+d₂)2= (158)2\n" +
                "⇒d₁+d₂ =158\n" +
                "d₁2+d₂2-2d₁d₂ = (16900-8064) =8836 ⇒ (d₁-d₂)2= (94)2\n" +
                "⇒d₁-d₂=94\n" +
                "d₁+d₂=158, d₁-d₂ =94 ⇒2d₁=252 ⇒d₁=126cm\n" +
                "⇒d₂= (158-126) =32 cm\n" +
                "∴diagonals are 126 cm, 32 cm.")
    , Questions(10, "What is the region of the shaded bit if every side of the square measures 21cm?",
        "86.5 sq.cm", "102 sq.cm", "94.5 sq.cm", "81.5 sq.cm", 3,"Area of the shaded region= [(21)2-22/7* (21/2)2]\n" +
                "= (441- 693/2) sq.cm = (441- 346.5) sq.cm\n" +
                "= 94.5 sq.cm")

)

var Probability= mutableListOf(
    Questions(1, "An event in the probability that will never be happened is called as -",
        "Unsure event", "Sure event", "Possible event", "Impossible event", 4,"An event that will never be happened is known as the impossible event.\n"+
                "For example - Tossing double-headed coins and getting tails in an impossible event, rolling a die and getting number > 10 in an impossible outcome, etc.")
    ,
    Questions(2, "What will be the value of P(not E) if P(E) = 0.07?",
        "90", "007", "93", "72", 3,"If the probability of happening of an event P(E) and that of not happening is P(E), then\n" +
                "P(E) + P(not E) = 1\n" +
                "So, P(not E) = 1 - P(E)\n" +
                "Since P(E) = 0.07\n" +
                "P(not E) = 1 - 0.07\n" +
                "P(not E) = 0.93")
    , Questions(3, "What will be the probability of getting odd numbers if a dice is thrown?"
        , "1/2", "2", "6/2", "5/2", 1,"The sample space when a dice is rolled, S = (1, 2, 3, 4, 5, and 6)\n" +
                "So, n (S) = 6\n" +
                "E is the event of getting an odd number.\n" +
                "So, n (E) = 3\n" +
                "Probability of getting an odd number P (E) = Total number of favorable outcomes / Total number of outcomes\n" +
                "n(E) / n(S) = 3/6 = 1/2")
    , Questions(4, "What is the probability of getting a sum as 3 if a dice is thrown?",
        "2/18", "1/18", "4", "1/36", 2,"In two throws a dice, n (S) = 6 * 6 = 36\n" +
                "\n" +
                "Let E is the event of getting a sum of three.\n" +
                "\n" +
                "E = (1, 2), (2, 1)\n" +
                "\n" +
                "So, n (E) = 2\n" +
                "\n" +
                "So, P (E) = n(E) / n(S) = 2/36 or 1/18")
    , Questions(5, "What is the probability of getting an even number when a dice is thrown?",
        "1/6", "1/2", "1/3", "1/4", 2,"The sample space when a dice is rolled, S = (1, 2, 3, 4, 5, and 6)\n" +
                "So, n (S) = 6\n" +
                "E is the event of getting an even number.\n" +
                "So, n (E) = 3\n" +
                "Probability of getting an even number P (E) = Total number of favorable outcomes/Total number of outcomes\n" +
                "n(E) / n(S) = 3/6 = 1/2")
    , Questions(6, "The probability of getting two tails when two coins are tossed is -",
        "1/6", "1/2", "1/3", "1/4", 4,"The sample space when two coins are tossed = (H, H), (H, T), (T, H), (T, T)\n" +
                "So, n(S) = 4\n" +
                "The event \"E\" of getting two tails (T, T) = 1\n" +
                "So, n(E) = 1\n"+
                "So, the probability of getting two tails, P (E) = n(E) / n(S) = 1/4")
    , Questions(7, "What is the probability of getting the sum as a prime number if two dice are thrown?",
        "5/24", "5/12", "5/30", "1/4", 2,"As per the question: n (S) = 6*6 = 36\n" +
                "And, the event that the sum is a prime number:\n" +
                "E = {(1, 1), (1, 2), (1, 4), (1, 6), (2, 1), (2, 3), (2, 5), (3, 2), (3, 4), (4, 1), (4, 3),\n" +
                "(5, 2), (5, 6), (6, 1), (6, 5)}\n" +
                "So, n (E) = 15\n" +
                "n(E) / n(S) = 15/36 = 5/12")
    , Questions(8, "What is the probability of getting atleast one head if three unbiased coins are tossed?",
        "7/8", "1/2", "5/8", "8/9", 1,"The sample space is = {TTT, TTH, THT, HTT, THH, HTH, HHT, HHH}\n" +
                "Let E is the event of getting atleast one head\n" +
                "Then E = {TTH, THT, HTT, THH, HTH, HHT, HHH}\n" +
                "P(E) = n(E) / n(S) = 7/8")
    , Questions(9, "What is the probability of getting 1 and 5 if a dice is thrown once?",
        "1/6", "1/3", "2/3", "8/9", 2,"The sample space when a dice is rolled, S = (1, 2, 3, 4, 5 and 6)\n" +
                "So, n (S) = 6\n" +
                "E is the event of getting 1 and 5\n" +
                "So, n (E) = 2\n" +
                "P (E) = Total number of favorable outcomes / Total number of outcomes\n" +
                "n(E) / n(S) = 2/6 = 1/3")
    , Questions(10, "What will be the probability of losing a game if the winning probability is 0.3?",
        "0.5", "0.6", "0.7", "0.8", 3,"Let P(E) is the probability of winning the game, and P(not E) be the probability of not winning the game.\n" +
                "P(E) + P(not E) = 1\n" +
                "So, P(not E) = 1 - P(E)\n" +
                "Since P(E) = 0.3\n" +
                "P(not E) = 1 - 0.3\n" +
                "P(not E) = 0.7")

)