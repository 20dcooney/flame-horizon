SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'flame_horizon';

DROP DATABASE flame_horizon;

