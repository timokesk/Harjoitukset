/* ========================================
 *
 * Copyright YOUR COMPANY, THE YEAR
 * All Rights Reserved
 * UNPUBLISHED, LICENSED SOFTWARE.
 *
 * CONFIDENTIAL AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF your company.
 *
 * ========================================
*/
#include <project.h>
#include <stdio.h>

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int current_hours;
    int current_minutes;
    int sleep_hours;
    int sleep_minutes;
    int wakeup_hours = 0;
    int wakeup_minutes;
    
    printf("Enter current time (hh:mm): ");
    scanf("%d:%d", &current_hours, &current_minutes);
    
    printf("How long do you want to sleep (h:mm): ");
    scanf("%d:%d", &sleep_hours, &sleep_minutes);
    
    wakeup_minutes = current_minutes + sleep_minutes;
    if (wakeup_minutes >= 60) {
        wakeup_minutes -= 60;
        wakeup_hours++;
    }
    
    wakeup_hours += current_hours;
    wakeup_hours += sleep_hours;
    if (wakeup_hours >= 24) {
        wakeup_hours -= 24;
    }
    
    if (wakeup_minutes >= 10) {
        printf("If you go to bed now you must wake up at %d:%02d.\n", wakeup_hours, wakeup_minutes);
    } else {
        printf("If you go to bed now you must wake up at %d:0%d.\n", wakeup_hours, wakeup_minutes);
    }
    
    for(;;)
    {
        /* Place your application code here. */
    }
}
int _write(int file, char *ptr, int len)
{
    (void)file; /* Parameter is not used, suppress unused argument warning */
	int n;
	for(n = 0; n < len; n++) {
        if(*ptr == '\n') UART_1_PutChar('\r');
		UART_1_PutChar(*ptr++);
	}
	return len;
}

int _read (int file, char *ptr, int count)
{
    int chs = 0;
    char ch;
 
    (void)file; /* Parameter is not used, suppress unused argument warning */
    while(count > 0) {
        ch = UART_1_GetChar();
        if(ch != 0) {
            UART_1_PutChar(ch);
            chs++;
            if(ch == '\r') {
                ch = '\n';
                UART_1_PutChar(ch);
            }
            *ptr++ = ch;
            count--;
            if(ch == '\n') break;
        }
    }
    return chs;
}
/* [] END OF FILE */
