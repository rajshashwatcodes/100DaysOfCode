#include <stdio.h>   /* printf */
#include <unistd.h>  
#include <seccomp.h> /* libseccomp */
#include <fcntl.h> /* For File Open() flags */
#include <stdlib.h> /* For exit() */

int main() {
  printf("step 1: unrestricted\n");
  // Init the filter
  scmp_filter_ctx ctx;
  ctx = seccomp_init(SCMP_ACT_KILL); // default action: kill

  // setup basic whitelist
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(rt_sigreturn), 0);
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(exit), 0);
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(read), 0);
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(write), 0);

  // setup our rule
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(getpid), 0);
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(getppid), 0);
  seccomp_rule_add(ctx, SCMP_ACT_ALLOW, SCMP_SYS(mkdir), 0);

  // build and load the filter
  seccomp_load(ctx);
  printf("step 2: only 'write' and getpid syscalls\n");
  
  // Get pid
  printf("step 3: pid=%d\n",getpid());

  // Get ppid
  printf("step 4: ppid=%d\n",getppid());

  int check = mkdir("ShashwatFolder",0777); // 0 at first indicate that the number is in octal (base 8).
 
    // check if directory is created or not
    if (!check)
        printf("step 5: Directory created\n");
    else {
        printf("step 5: Unable to create directory\n");
        exit(1);
    }

  printf("step 6: !! YOU SHOULD SEE ME NOW !!\n");

  // Success (well, not so in this case...)
  return 0;
}
//gcc seccompfilter.c -lseccomp
