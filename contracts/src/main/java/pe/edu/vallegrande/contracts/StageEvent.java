package pe.edu.vallegrande.contracts;

public record StageEvent(
        PipelineStage stage,
        StageStatus status,
        String timestamp,
        Long rows,
        Long durationMs,
        Integer sparkJobs,
        String detail
) {
}
