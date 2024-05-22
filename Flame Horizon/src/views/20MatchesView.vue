<template>
    <div></div>
</template>

<script>

import MatchService from '../services/MatchService';

export default {
    methods: {
            listMatches() {
                MatchService.list() {
                    
                }
            }
        },

        created() {
            this.listMatches();
        }
}
</script>

<style>
</style>